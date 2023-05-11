package testes;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class b {

	public static void main(String[] args) {
		Date data = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println(data);
		System.out.println("Data e Hora atual: "+c.getTime());
		
		System.out.println("?????????????????");
		LocalDateTime dataAtual = LocalDateTime.now();
		LocalDateTime dataFutura = dataAtual.plusDays(1);
		System.out.println(dataAtual);
		System.out.println(dataFutura);
		String dataAtualFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String dataFuturaFormatada = dataFutura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dataAtualFormatada);
		System.out.println(dataFuturaFormatada);
		//String aa = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//LocalDateTime localDateTime3 = LocalDateTime.now().plusDays(1);
		
		System.out.println("?????????????????");
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println(myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println(formattedDate);
	}
}