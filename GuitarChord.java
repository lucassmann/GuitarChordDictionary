public class GuitarChord   //Classe para objeto e construtor.
{
    private int[][] guitarChordArray = //matriz feita de forma a representar graficamente no terminal as primeiras casas de um violão, utilizada posteriormente em Acorde(String chordName).
    {
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
    };
 
    public GuitarChord(String chordName) { //método para modificar a matriz guitarChordArray de forma a representar o acorde dado pela String chordName.
    
        
        switch (chordName) //switch utilizado para selecionar entre diferentes acordes, assim como modificar a matriz e invocar o médito print().
        {
            case "C":
            guitarChordArray[1][4] = 1;
            guitarChordArray[2][2] = 2;
            guitarChordArray[3][1] = 3;
            break;
            
            case "D":
            guitarChordArray[2][3] = 1;
            guitarChordArray[2][5] = 2;
            guitarChordArray[3][4] = 3;
            break;
            
            case "E":
            guitarChordArray[1][3] = 1;
            guitarChordArray[2][2] = 3;
            guitarChordArray[2][1] = 2;
            break;
            
            case "G":
            guitarChordArray[1][4] = 1;
            guitarChordArray[2][1] = 2;
            guitarChordArray[3][0] = 3;
            break;
            
            case "A":
            guitarChordArray[2][2] = 1;
            guitarChordArray[2][3] = 2;
            guitarChordArray[2][4] = 3;
            break;
            
            default:
                System.out.println("Desculpe, não temos esse acorde" ); //Default para exclarecer ao usuário o motivo do erro.
        }
    }
    public void print() //método para imprimir a matriz que representa o acorde.
    {
        for(int row=0; row < guitarChordArray.length; row++) 
            {
                for(int col=0; col < guitarChordArray[row].length; col++) 
                {
                     System.out.print(guitarChordArray[row][col] + "\t");
                }
                System.out.println("Casa" + row);  //indicador das casas do braço do violão.
            };
    }
}




