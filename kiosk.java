import MenuAndFood.Food;
import MenuAndFood.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class kiosk {//
    public static void main(String[] args) throws InterruptedException {
        String shop = "알트콤마";
        Scanner sc = new Scanner(System.in);
//수정
        Menu menu1 = new Menu("Food","식사류, 가볍게 먹을 수 있는핑거푸드");
        Menu menu2 = new Menu("Cocktail","시그니처 칵테일");
        Menu menu3 = new Menu("Whiskey","다양한 종류의 위스키");

        Food food1 = new Food("통통한 문어 구이","오일로 부드럽게 저온 조리한 문어에 베이컨 소스를 곁들인 플레이트",25000);
        Food food2 = new Food("와인 품은 소 볼살 조림","와인에 조려 부드럽게 조리한 소 볼살 조림고마 구운 야채",25000);
        Food food3 = new Food("무화과 프렌치토스트","촉촉한 빵 위로 레드와인에 절인 무화과를 올린 가을 한정 프렌치 토스트",12000);
        Food food4 = new Food("알트콤마 버거","부위별로 지방과 살코기의 비율을 잘 맞춰 육즙과 식감을 살린 수제 버거",15000);

        Food cocktail1 = new Food("아이엠 피넛 버터","피넛버터에 인퓨징한 버번 위스키에서 나오는 고소함과 달콤함이 좋은 칵테일입니다.",15000);
        Food cocktail2 = new Food("체리쉬","체리와 블랙티에 인퓨징한 버번 위스키와 당일 스퀴징한 레몬 주스를 넣어 체리 풍미와 산뜻한 신맛이 좋은 칵테일입니다.",15000);
        Food cocktail3 = new Food("블랙베리 앤 베이","블랙베리의 단맛과 라임 민트의 향긋함이 좋은 칵테일입니다.",15000);

        Food whiskey1 = new Food("Knop Creek Bourbon","50%, 짐빔 특유의 땅콩맛이 도드라지는 위스키",13000);
        Food whiskey2 = new Food("Sagamore double oak Rye","48.3%, 새로운 오크통에 추카로 숙성시킨 라이 위스키",19000);
        Food whiskey3 = new Food("Charbay R5","49.5%, 맥주 양조장에서 만들고 프렌치오크통에 6.5년간 숙성시킨 위스키",29000);

        List<Menu> menuList = new ArrayList<Menu>();
        List<Food> foodList = new ArrayList<Food>();
        List<Food> cocktailList = new ArrayList<Food>();
        List<Food> whiskeyList = new ArrayList<Food>();
        List<Food> orderList = new ArrayList<Food>();

        menuList.add(menu1);menuList.add(menu2);menuList.add(menu3);
        foodList.add(food1);foodList.add(food2);foodList.add(food3);foodList.add(food4);
        cocktailList.add(cocktail1);cocktailList.add(cocktail2);cocktailList.add(cocktail3);
        whiskeyList.add(whiskey1);whiskeyList.add(whiskey2);whiskeyList.add(whiskey3);

        boolean flag = true;
        int cnt = 1;
        while(flag==true){
        System.out.printf("\n\"%s 에 오신걸 환영합니다.\"\n", shop);

        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.printf("[ %s MENU ]\n", shop);
        for(int i=1;i<menuList.size()+1;i++){
            System.out.printf("%d. %s\t | %s\n",i,menuList.get(i-1).getName(),menuList.get(i-1).getDescription());
        }
        System.out.println("\n[ ORDER MENU ]");
        System.out.printf("4. Order\t 장바구니를 확인 후 주문합니다.\n");
        System.out.printf("5. Cancel\t 진행중인 주문을 취소합니다.\n");
        System.out.println("6. Quit\t 프로그램을 종료합니다.");

        int menu_select = sc.nextInt();
        int order = 0;
        int confirm = 0;
        int sum = 0;

        switch (menu_select) {
            case 1:
                System.out.printf("\"%s 에 오신걸 환영합니다.\"\n", shop);
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n[ Food MENU ]");
                for (int i = 0; i < foodList.size(); i++) {
                    System.out.print(i + 1 + ". ");
                    System.out.println(foodList.get(i).toString());
                }
                order = sc.nextInt();
                System.out.print("\"" + foodList.get(order-1).toString() + "\"\n");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인\t\t 2. 취소");
                confirm = sc.nextInt();
                if(confirm==1){
                    orderList.add(foodList.get(order - 1));
                    System.out.printf("%s 가 장바구니에 추가되었습니다.\n",foodList.get(order-1).getName());
                }else System.out.println("취소되었습니다.");
                break;
            case 2:
                System.out.printf("\"%s 에 오신걸 환영합니다.\"\n", shop);
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n[ Cocktail MENU ]");
                for (int i = 0; i < cocktailList.size(); i++) {
                    System.out.print(i + 1 + ". ");
                    System.out.println(cocktailList.get(i).toString());
                }
                order = sc.nextInt();
                System.out.print("\"" + cocktailList.get(order-1).toString() + "\"\n");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인\t\t 2. 취소");
                confirm = sc.nextInt();
                if(confirm==1){
                    orderList.add(cocktailList.get(order - 1));
                    System.out.printf("%s 가 장바구니에 추가되었습니다.\n",cocktailList.get(order-1).getName());
                }else System.out.println("취소되었습니다.");
                break;
            case 3:
                System.out.printf("\"%s 에 오신걸 환영합니다.\"\n", shop);
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n[ Whiskey MENU ]");
                for (int i = 0; i < whiskeyList.size(); i++) {
                    System.out.print(i + 1 + ". ");
                    System.out.println(whiskeyList.get(i).toString());
                }
                order = sc.nextInt();
                System.out.print("\"" + whiskeyList.get(order-1).toString() + "\"\n");
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인\t\t 2. 취소");
                confirm = sc.nextInt();
                if(confirm==1){
                    orderList.add(whiskeyList.get(order - 1));
                    System.out.printf("%s 가 장바구니에 추가되었습니다.\n",whiskeyList.get(order-1).getName());
                }else System.out.println("취소되었습니다.");

                break;
            case 4:
                System.out.println("아래와 같이 주문 하시겠습니까?");
                for(Food ordered_food:orderList){
                    System.out.println(ordered_food);
                    sum += ordered_food.getPrice();
                }
                System.out.println("[total]");

                System.out.println("W " + sum);
                System.out.println("1. 주문 \t\t 2. 메뉴판");
                int final_order = sc.nextInt();

                if(final_order==1){
                    System.out.println("주문이 완료되었습니다!");
                    System.out.printf("\n대기번호는 [ %d ] 번 입니다.\n",cnt++);
                    System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
                    orderList.clear();
                    TimeUnit.SECONDS.sleep(3);

                }else flag = true;

                break;
            case 5:
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인 \t\t 2. 취소");
                int cancel = sc.nextInt();
                if(cancel==1){
                    orderList.clear();
                    System.out.println("진행하던 주문이 취소되었습니다.");
                }
            case 6:
                flag = false;
            default:
                flag=false;
                break;
        }
        }
    }
}
