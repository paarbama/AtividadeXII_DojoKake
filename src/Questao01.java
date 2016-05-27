
public class Questao01 {

	public static void main(String[] args) {
			preencherMatriz();

	}

	static void preencherMatriz() {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a matriz");
		n = scanner.nextInt();
		int[][] A = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j){
					A[i][j] = 0;
				}else{
					if (i+j == n-1) {
						A[i][j] = 0;
					}else{
						A[i][j] = 1;
					}
				}		
			}			

		}


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j]+ "\t");

			}
			System.out.println("");
		}

	}

}

