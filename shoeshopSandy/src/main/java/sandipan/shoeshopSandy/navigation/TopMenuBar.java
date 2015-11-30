package sandipan.shoeshopSandy.navigation;

import sandipan.shoeshopSandy.navigation.TopMenu.SubMenu;

public class TopMenuBar {
	
	public static class Women {
		public static  class Heels{
			public static void select() {
				// TODO Auto-generated method stub
				//MenuSelector.Select("Women","Heels");
				
				MenuSelector.Select(TopMenu.WOMEN, SubMenu.WOMEN_HEELS );
				
						
			}	
			public static class HighHeels{
				public static void select() {
					
				}
				
			}
			
		}
		public class Sandals{
			
		}
		public class Shoes{
			
		}
	}
	 public class Men {
		 public class Shoes{
			 
		 }
		 
		 public class Sneakers{
			 
		 }
		 
		 public class Atheletics{
			 
		 }
		 
		 public class Loafers{
			 
		 }
	 }
	 
	 public class Kids{
		 public class Boys{
			 
		 }
		 public class Girls{
			 
		 }
		 
	 }

}
