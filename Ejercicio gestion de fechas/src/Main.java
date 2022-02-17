import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Imprime la fecha de hoy
		LocalDate fechaActual = LocalDate.now();
		System.out.println("La fecha de hoy es:" + fechaActual);

		// Imprime la hora actual
		LocalTime horaActual = LocalTime.now();
		System.out.println("La hora actual es:" + horaActual);

	
		System.out.println("La fecha y la hora actual es: "+fechaActual+" ---> "+horaActual);

		LocalDate fechaActual1 = LocalDate.now();	
		LocalDate fechanueva=fechaActual.plusMonths(3).plusDays(23);

		LocalTime horaActual1=horaActual.plusHours(14);
		System.out.println(fechanueva+" ---> "+horaActual1);

		LocalDate fechaActual2 = LocalDate.now();	
		LocalDate fechanueva1=fechaActual.minusMonths(43).minusDays(23);

		LocalTime horaActual2=horaActual.plusHours(14);
		System.out.println(fechanueva1+" ---> "+horaActual2);
		
		
		System.out.println();
		System.out.println();
  

	}

}
