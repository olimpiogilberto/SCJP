
package cap1.x;

public class Papi {
	final void setNum() { System.out.println("final");}
/* aqui estou subscrevendo meu m�todo final, isso n�o � v�lido para um c�digo que n�o compila */
	
	class fifi extends Papi{
		public void setNum(){}
	} 

}
