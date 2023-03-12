
import java.time.*;
import java.time.format.*;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 26);

        int anos = olimpiadasParis.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasParis);
//        System.out.println(periodo);
        System.out.println(periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        YearMonth mes = YearMonth.now();
        System.out.println(mes);

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);
        System.out.println(intervalo.getHour());
        System.out.println(intervalo.getMinute());

    }

}