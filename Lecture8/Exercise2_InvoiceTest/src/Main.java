import com.sun.jdi.Method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        Class obj = test.getClass();

        System.out.println("Class name: " + obj.getName());
        System.out.println("Class modifier: " + Modifier.toString(obj.getModifiers()));

        Constructor[] constructors = obj.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Construcotr name: " + constructor.getName());
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
        }

        Method method1Invoke = obj.getMethod("method1");
        method1Invoke.invoke(test);
        Method method2Invoke = obj.getMethod("method2", int.class);
        method2Invoke.invoke(test);
        Method method3Invoke = obj.getMethod("method3", int.class);
        method3Invoke.getAccessible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}