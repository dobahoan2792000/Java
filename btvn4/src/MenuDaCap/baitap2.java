package MenuDaCap;

import java.util.ArrayList;
import java.util.List;

public class baitap2 {
	public static void main(String[] args) {
		var menuLinhVuc = new menu(10,"Linh vuc",0);
		var menuNhaHang = new menu(11,"Nha hang",10);
		var menuKinhDoanh = new menu(12,"Kinh doanh",10);
		var menuDulich = new menu(13,"Du lich",10);
		var menuTinTuc = new menu(20,"Tin tuc",0);
		var menuKyThuatIn = new menu(24,"Ky thuat in",20);
		var menuDoHoa = new menu(25,"Do hoa",20);
		var menuMyThuat = new menu(26,"MyThuat",20);
		var listMenu = new ArrayList<menu>();
		listMenu.add(menuLinhVuc);
		listMenu.add(menuNhaHang);
		listMenu.add(menuKinhDoanh);
		listMenu.add(menuDulich);
		listMenu.add(menuTinTuc);
		listMenu.add(menuKyThuatIn);
		listMenu.add(menuDoHoa);
		listMenu.add(menuMyThuat);
		var listMenuDaCap = arrayDataMenuWithIndent(listMenu, 0, "");
		for(menu mn:listMenuDaCap)
		{
			System.out.println(mn.name);
		}
	}
	public static ArrayList<menu> menuWithIndent = new ArrayList<menu>();
	private static List<menu> arrayDataMenuWithIndent(ArrayList<menu> listMenu, int i, String string) {
		for(menu menu:listMenu)
		{
			menu menuTmp = new menu();
			if(menu.parentId!=i)
				continue;
			menuTmp.name =string + menu.name;
			menuTmp.id = menu.id;
			menuTmp.parentId = menu.parentId;
			menuWithIndent.add(menuTmp);
			arrayDataMenuWithIndent(listMenu, menu.id, "--");
			}
		
		return menuWithIndent;
		
	}
}
