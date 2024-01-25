package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lesson26ExcelUtillities.ExcelUtillities;

public class TestCaseUsingExcel {

	@Test(dataProvider = "MyExcel")
	public void test1() {

	}

	@DataProvider
	public Object[][] MyExcel() {
		return ExcelUtillities.getDataFromTable("LoginTable", "naza", "src/test/java/Excel/MyExcel.xlsx");
	}

}
