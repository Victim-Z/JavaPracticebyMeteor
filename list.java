import java.util.List;
import java.util.ArrayList;

class list {

    public static void main(String[] args) {
        //使用ArrayList类创建列表
        List<Integer> numbers = new ArrayList<>();

        //将元素添加到列表
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        numbers.add(2);
        numbers.add(9);
        System.out.println("List: " + numbers);

        //从列表中访问元素
        int number = numbers.get(2);
        System.out.println("访问元素: " + number);

        //从列表中删除元素
        int removedNumber = numbers.remove(1);
        System.out.println("删除元素: " + removedNumber);
    }
}
