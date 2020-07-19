package bai3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class baitap3 {
	public static void main(String[] args) {
		Set<Menu> listMenu = new HashSet<Menu>();
		var menuLinhVuc = new Menu(10,"Linh vuc",0);
		var menuNhaHang = new Menu(11,"Nha hang",10);
		var menuKinhDoanh = new Menu(12,"Kinh doanh",10);
		var menuDulich = new Menu(13,"Du lich",10);
		var menuTinTuc = new Menu(20,"Tin tuc",0);
		var menuKyThuatIn = new Menu(24,"Ky thuat in",20);
		var menuDoHoa = new Menu(25,"Do hoa",20);
		var menuMyThuat = new Menu(26,"MyThuat",20);
		listMenu.add(menuLinhVuc);
		listMenu.add(menuNhaHang);
		listMenu.add(menuKinhDoanh);
		listMenu.add(menuDulich);
		listMenu.add(menuTinTuc);
		listMenu.add(menuKyThuatIn);
		listMenu.add(menuDoHoa);
		listMenu.add(menuMyThuat);
		Iterator<Menu> itr = listMenu.iterator();
//		var listMenuDaCap = hashSetDataMenu(listMenu,0,"-");
//		Iterator<Menu> itr = listMenuDaCap.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getName());
		}
	} 
//	public static HashSet<Menu> menuWithIndent = new HashSet<Menu>();
//	private static HashSet<Menu> hashSetDataMenu(HashSet<Menu> listMenu, int i, String string) {
//		for(Menu menu:listMenu)
//		{
//			Menu menuTmp = new Menu();
//			if(menu.getParent_id()!=i)
//				continue;
//			menuTmp.setName(string + menu.getName()); 
//			menuTmp.setId(menu.getId());
//			menuTmp.setParent_id(menu.getParent_id()); 
//			menuWithIndent.add(menuTmp);
//			System.out.println(menuTmp.getName());
//		
//			hashSetDataMenu(listMenu, menu.getId(), "--");
//			}
//			
//		return menuWithIndent;
//	}
	
}
