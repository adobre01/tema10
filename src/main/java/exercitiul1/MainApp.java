package exercitiul1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args)
    {


        //Autoturism a=new Autoturism("Audi", 120, 50, 51);
        //System.out.println(a);

        BeanFactory factory=new ClassPathXmlApplicationContext("beans_ex2.xml");
        Vehicul d=(Vehicul)factory.getBean("vehicul");


    }

}