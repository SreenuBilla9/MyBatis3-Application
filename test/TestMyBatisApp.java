import org.junit.Assert;
import org.junit.Test;

import com.billa.dao.dto.AppUserDTO;
import com.billa.dao.exception.DatabaseException;
import com.billa.dao.mybatis.AppUserDAOMyBatis;

public class TestMyBatisApp {

	@Test
	public void deleteUser() {
		AppUserDAOMyBatis dao = new AppUserDAOMyBatis();
		System.out.println("deleteUser start");
		AppUserDTO user = new AppUserDTO();

		user.setUsername("TESTUSER");
		try {
			int rows = dao.deleteAppUser(user);
			System.out.println("rows=" + rows);
			if (rows == 0)
				Assert.fail("User " + user.getUsername() + " does not exists");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		System.out.println("deleteUser end");
	}

	@Test
	public void insertUser() {
		AppUserDAOMyBatis dao = new AppUserDAOMyBatis();
		System.out.println("insertUser start");
		AppUserDTO user = new AppUserDTO();

		user.setUsername("Test1234");
		try {
			int rows = dao.insertAppUser(user);
			System.out.println("rows=" + rows);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		System.out.println("insertUser end");
	}

	@Test
	public void updateUser() {
		AppUserDAOMyBatis dao = new AppUserDAOMyBatis();
		System.out.println("updateUser start");
		AppUserDTO user = new AppUserDTO();
		user.setIsEnabled("H");
		user.setIsLocked("J");
		user.setUsername("Test1234");
		try {
			int rows = dao.updateAppUser(user);
			System.out.println("rows=" + rows);
			if (rows == 0)
				Assert.fail("No record found to update , " + user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		System.out.println("updateUser end");
	}

	@Test
	public void selectUser() {
		System.out.println("selectUser  start");
		AppUserDAOMyBatis dao = new AppUserDAOMyBatis();
		AppUserDTO user = null;
		try {
			user = dao.selectAppUser("Test1234");
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		System.out.println(user);
		System.out.println("selectUser  end");
	}
}
