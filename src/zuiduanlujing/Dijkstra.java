package zuiduanlujing;
import java.io.IOException;

import java.util.Scanner;

public class Dijkstra {
    private char[] vertex;    //顶点集合
    private int[][] matrix;   //邻接矩阵
    private static final int INF = 999999; //最大值

    public Dijkstra() {
        Scanner sca   = new Scanner(System.in);
        System.out.println("请输入城市的个数及城市之间路径的个数：");
        int vertexNum = sca.nextInt();//顶点数
        int matrixNum = sca.nextInt();
        System.out.println("请输入各个城市的名字：");//边数
        vertex        = new char[vertexNum];
        vertex = sca.next().toCharArray();       //初始化顶点
        //初始化矩阵
        System.out.println("请输入城市的名字及城市之间的距离：(例：城市A 城市B 5)");
        matrix = new int [vertexNum][vertexNum];
        for(int i = 0; i < vertexNum; i++)
            for(int j = 0; j < vertexNum; j++)
                matrix[i][j] = 	(i == j) ?  0 : INF;
        for(int i = 0; i < matrixNum; i++) {     //初始化边的权值
            char start     = readChar();             //边的起点
            char end       = readChar();             //边的终点
            int weight     = sca.nextInt();          //边的权值
            int startInedx = getLocation(start); //获取边的起点坐标
            int endIndex   = getLocation(end);   //获取边的终点坐标
            if(startInedx == -1 || endIndex == -1) return;
            matrix[startInedx][endIndex] = weight;
            matrix[endIndex][startInedx] = weight;

        }

    }
    //读取字符
    private char readChar() {
        char ch = '0';
        do {
            try {
                ch = (char)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')));
        return ch;
    }
    /**
     * 返回字符的位置
     */
    private int getLocation(char c) {
        for(int i = 0; i < vertex.length; i++)
            if(vertex[i] == c) return i;
        return -1;
    }

    public void dijkstra(int start) {
        int num = matrix[0].length;
        //前驱节点
        int[] prefix = new int[num];
        //最短距离组
        int[] mindist = new int[num];
        //该节点是否已经找到最短路径
        boolean[] isMinDist = new boolean[num];
        int snear = 0;
        //初始化前驱顶点和第一个顶点到其他顶点的最短路径
        for(int i = 0; i < num; i++) {
            prefix[i]    = i;                    //刚开始前驱节点是本身
            mindist[i]   = matrix[start][i];     //刚开始，第一个顶点到每个顶点的最短距离就是对应权值
            isMinDist[i] = false;
        }
        isMinDist[start] = true;                 //第一个顶点，已经找到最短路径，更改状态
        for(int i = 1; i < num; i++) {
            //每次循环求得距离start最近的顶点snear和最短距离min
            int min = INF;
            for(int j = 0; j < num; j++) {
                if(!isMinDist[j] && mindist[j] < min) {
                    min = mindist[j];
                    snear = j;
                }
            }
            isMinDist[snear] = true;            //知道start到此顶点的最短距离
            //根据snear修正start到其他所有节点的前驱节点及距离
            for(int k = 0; k < num; k++) {
                if(!isMinDist[k] && ((min + matrix[snear][k]) < mindist[k])) {
                    prefix[k] = snear;
                    mindist[k] = min + matrix[snear][k];
                }
            }
        }
        //打印寻找最短路径
        for(int i = 0; i < num; i++)
            if(mindist[i] == INF){

                System.out.println(vertex[start] + " 城市到 " + vertex[i] + "的最短路径距离为： 不可到达!" );
            }
        else {
                System.out.println(vertex[start] + " 城市到 " + vertex[i] + "的最短路径距离为： " + mindist[i]);
            }
    }

}
