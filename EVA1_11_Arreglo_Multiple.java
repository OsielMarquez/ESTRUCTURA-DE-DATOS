
package EVA_1;
public class EVA1_11_Arreglo_Multiple {

	public static void main(String[] args) {
		int arregloMultiDim[][][][]= new int[3][3][3][3];
	       
	       //arregloMultiDim[2][2][0][0] = 100;
	       
	        for (int i = 0; i < arregloMultiDim.length; i++) {
	            for (int j = 0; j < arregloMultiDim[i].length; j++) {
	                for (int k = 0; k < arregloMultiDim[i][j].length; k++) {
	                    for (int l = 0; l < arregloMultiDim[i][j][k].length; l++) {
	                        arregloMultiDim[i][j][k][l]=(int) (Math.random()*100);
	                    }
	                }
	            }
	        }
	        for (int i = 0; i < arregloMultiDim.length; i++) {
	            for (int j = 0; j < arregloMultiDim[i].length; j++) {
	                for (int k = 0; k < arregloMultiDim[i][j].length; k++) {
	                    for (int l = 0; l < arregloMultiDim[i][j][k].length; l++) {
	                        System.out.print("["+arregloMultiDim[i][j][k][l]+"]");
	                        //System.out.println(arregloMultiDim[i][j][k][l]);
	                    }
	                
	                }
	            }
	        }
	}

}
