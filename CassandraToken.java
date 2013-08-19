import java.math.BigInteger;

public class CassandraToken{

	public static void main(String[] args){

		if (args.length == 0){
			System.exit(0);
		}

		int numberOfNode = Integer.parseInt(args[0]);
		BigInteger num  = BigInteger.valueOf(numberOfNode);
		BigInteger power = BigInteger.valueOf(2).pow(127);
		System.out.println("\n\n");
		for( int i =0; i < numberOfNode; i++){

			BigInteger temp = power.divide(num);
			temp = temp.multiply(BigInteger.valueOf(i));

			System.out.println("Node : " + i);
			System.out.println("initial_token : " + temp);
			System.out.println("");
		}
	}
}