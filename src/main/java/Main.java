import config.*;
import entity.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user.UserDAO;
import weekDay.WeekDay;

public class Main {
    public static void main(String[] args) {

        //Получение и работа с бинами из пакетов(entity | weekDay)
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = (Cat)context.getBean("cat");
        System.out.println(cat.getName());

        WeekDay weekDay = (WeekDay) context.getBean(WeekDay.class);
        System.out.println(weekDay.getWeekDayName());

        //Получение и работа с бинами из пакета (user)
        ApplicationContext context_user =
                new AnnotationConfigApplicationContext(ConfigUserGetApplication.class);

        UserDAO user_dao = context_user.getBean(UserDAO.class);
        String text = user_dao.getUserRepository();
        String url = user_dao.getUser_url();
        System.out.println(url);
        System.out.println(text);
    }

}
