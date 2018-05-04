TESTE  S2IT	
	Respostas
1- A

2- E  (OBS: Fiquei em dúvida, pois nunca trabalhei com Jetty nem WebSphere, então chutei)

3- C

4- A

5- A

6- C

7- E

8----------------------------------------

public class exercicio8 {

	private int maior;
	private Integer MENOS_UM = -1;
	private char[] valorA;
	private char[] valorB;
	
    public Integer getCValue(final int a, final int b) {
    	
    	if(a!=null && b!=null){    	
			this.valorA = a.toString().toCharArray();
			this.valorB = b.toString().toCharArray();
		}
		
        StringBuilder valorC = new StringBuilder();
        
        if(this.valorA.length > this.valorB.length)
        {
        	this.maior = this.valorA.length;
        }else{
        	this.maior = this.valorB.length;
        }

        for (int novoNo : maior) {
            if (valorA.length > novoNo) {
            	valorC.append(String.valueOf(valorA[novoNo]));
            }
            if (valorB.length > novoNo) {
            	valorC.append(String.valueOf(valorB[novoNo]));
            }
        }

        int c = Integer.parseInt(valorC.toString());
		int resultado = 0; 
		
		if(c>1000000){
			resultado=MENOS_UM;
		}
		else{
			resultado=c;
		}
		
        
        return resultado;
		
    }
} 

------------------

9-----------------------------

public class BinaryTree {
	int valor;
	BinaryTree left;
	BinaryTree right;
	
public BinaryTree(int valorNo)
    {
        this.valor = valorNo;
        this.left = null;
        this.right = null;
    }

    public void IncluiNovoNo(int novoNo)
    {
         int valorNo = valor;
		
         if ( novoNo < valorNo )
         {
             if (left != null) 
             {
                 left.IncluiNovoNo(novoNo);
             }
             else
             {
                 left = new BinaryTree(novoNo);
             }
         }
         else
         {
             if (right != null)
             {
                 right.IncluiNovoNo(novoNo);
             }
             else
             {
                 right = new BinaryTree(novoNo);
             }
         }
    }
	
	system.output.println("Valor da direita:"+ sum(this.right);
	system.output.println("Valor da esquerda:"+ sum(this.left);
}










