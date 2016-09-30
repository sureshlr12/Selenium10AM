

public class ExcelOperations {

	public static void main(String[] args) {
		
	 Xls_Reader excel= new Xls_Reader("C:\\Users\\qtt\\Desktop\\premchand_Weekend\\Tutorial 2\\src\\config\\DataDriven.xlsx");
     
	 int rows= excel.getRowCount("Dummy");
	 System.out.println("Number of Rows="+rows);
	 
	 int columns = excel.getColumnCount("Dummy");
	 System.out.println("Number of Columns="+columns);
	 
	 String value=excel.getCellData("Dummy", 0, 5);
	 System.out.println("data-->"+value);
	 
	 excel.setCellData("Dummy", "Password", 15, "chiru");
	 
	 excel.addColumn("Dummy","Location");
	 
	 excel.addSheet("TestStatus");
	 
	}

}
