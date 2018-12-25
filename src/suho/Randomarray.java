package suho;

import java.util.Random;

public class Randomarray {

	public static void main(String[] args) {
		
		String[] result = {};
		String[] vivace = {"은지","서우","지우","창준","현일"};
        String[] royal = {"창하","수호","은영","정욱",""};
        String[] atlas = {"동준","이레","종협","지은",""};
        String[] ntom = {"정우","기호","승아","태혁",""};
        String[][] mtx = {vivace,royal,atlas,ntom};
        int[][] sum = new int[5][5];
        Random random = new Random();
        
        for(int i=0;i<mtx.length;i++) {
        	for(int j=0;j<mtx.length;j++) {
        		sum[i][j] = random.nextInt(90)+10; 
        		System.out.print(mtx[i][j]+sum[i][j]);
        		
        	 }
        	System.out.println("");
        	} 
        	}
        }