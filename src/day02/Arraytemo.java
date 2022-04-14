package day02;

public class Arraytemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 6, 6, 5, 5, 9};
        int temp[]= Quc(array);
        for (int i =0; i< temp.length;i++){
            System.out.println(temp[i]);
        }

    }
    public static int[] Quc(int[] array){

        int count = 0;
        int[] temp = new int[count];
        for(int i = 0;i< array.length;i++){
            for(int j = i+1;j<temp.length;j++){
                if(array[i] == temp[j]){
                    break;
                }
                else{
                    temp[j] = array[i];
                }
            }
        }
        return temp;
    }

}

