
public class Ex2 {
	int prestej(String beseda){
		int counter = 0;
		for(int i = 0; i < beseda.length(); i++){
			char tmp = beseda.charAt(i);
			if(tmp == 'a' || tmp == 'i' || tmp == 'e' || tmp == 'o' || tmp == 'u'){
				counter++;
			}
		}
		return(counter);
	}
}
