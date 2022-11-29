package EgPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5,6);
		
		List <Integer> Square = number.stream().map(x->x*x).collect(Collectors.toList());
		Square.forEach(s->System.out.println(s));

	}
}
