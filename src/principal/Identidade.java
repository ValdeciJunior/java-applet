package principal;

import javax.swing.JApplet;

public class Identidade extends JApplet {
	private static final long serialVersionUID = 1L;
	@Override
	public void init() {
		int a[][] = new int [3][3];
		for(int i = 0; i<3; i++) {
			for(int z = 0; z<3; z++){
				if(i == z) {
					a[i][z] = 1;
				}else {
					a[i][z] = 0;
				}
				System.out.print(a[i][z]);
			}
			System.out.println("\n=======");
		}
	}
}
