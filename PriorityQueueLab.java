import java.util.*;
import java.io.*;


public class PriorityQueueLab {

	public static void main(String[] args) {
		Scanner in;
		try {
		in = new Scanner(new File("src/RandIntegers.txt"));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < 10; i++) {
			pq.add(in.nextInt());
		}
		for(int i =0; i < 10; i++) {
			System.out.println(pq.remove());
		}
		}catch(Exception e) {
			System.out.println("Exception:" + e);
		}
	}

}
