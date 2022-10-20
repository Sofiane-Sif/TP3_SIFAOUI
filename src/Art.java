public class Art {

    private static int height, width;
    public Art(){ // constructeur

    }

    public static void asciiArt(int height, int width){

        // Top of the draw : ears and head
        System.out.print("|\\");   // besoin de 2 backslash sinon c'est considéré comme un caractère d'échappement
        for(int i = 1; i <= width-4; i++){
            System.out.print("-");
        }
        System.out.println("/|");

        // Middle of the head and eyes
        for(int j = 1; j < height-1; j++){

            System.out.print("|");
            if(j == height/2){
                System.out.print(" ");
                System.out.print("o");
                for(int i = 0; i < width-6; i++){
                    System.out.print("_");
                }
                System.out.print("o ");
            }
            else{
                for(int k = 0; k < width-2; k++){
                    System.out.print(" ");
                }
            }

            System.out.println("|");
        }


        // Bottom of the cat's head and mouse

        System.out.print(" \\_");
        for(int i=0; i < width - 6; i++){
            System.out.print("^");
        }
        System.out.println("_/ ");
    }
}
