package Sel_Rumination;

public class Stuff {

    
    1. 캡슐화 2. 다형성 3. %d의 정체 4.
        
        
=============================================================================================================

        
        
        
1.    캡슐화, 은닉
        ↖는 지정자 (선언 대상)에 private 붙인 거다 별거 아님 
                호출이 불가해져서 private 붙은 지정자 녀석은 메소드를 써야함
        
        ex)    private int profeno;
               protected String Oollala;
               public double hagisilta;       -> 이어지지  hagisilta = 3.1425673;    

    
    
    
    
    
    
2.   다형성 - 매개변수 대통합의 장
            ⓐㅡ 본체 클래스 등장! -예시로 add를 드랍한다! hulala도 됨
                                        
                    class ㅁㅁㅁ {    ↙ ●지정자 자리에 예시로 add 넣기!●
                    public int  ●add●  (double ㅁ, int ㅁㅁ  ㅡㅡㅡㅡㅡㅡㅡ>>> 하나가 double 이고 딴건 int인데) {
                                                    return 반환 값 넣고? }  다음으로 감


            ⓑㅡ  오버로딩한 (한 클래스에 메소드 여러개 넣기) 클래스 등장!!
            
                 class 롸롸 {                              ↙ ●예시로 add 넣기!●
                       int로 묶은 메서드1 -> public int ●add●(int ㅁ, int ㅁㅁ, int ㅁㅁㅁ) {
                                             return ㅁ + ㅁㅁ + ㅁㅁㅁ; }
                       double 세트 메서드2 -> public double ●add●(double a, double b) {
                                              return a + b; }   ↙ 다 넣어버려 add!!
                       String 세트 메서드3 -> public String ●add●(String A, String B, String C) {
                                                                return "A" + "B" + "C" ; }
                              } class 롸롸 에 셋씩이나 떄려넣었다! 


             ⓒㅡ 오버로딩할 클래스 등장!!  ●지정자에 umhaha.add 넣기●
                                              ↙지정자명을 umhaha로 했으면
                        class ### {  melala umhaha = new Over();
                                                    ↙ ●지정자에 umhaha.add 로 넣기!●
                        System.out.println( ●umhaha.add● ( ㅁ , ㅁㅁ)); } <- 매개변수 별로 double ㅁ int ㅁㅁ 을 안쓰고
                                                                            ㅁ,ㅁㅁ으로만 써도 정상적으로 println이 됨!!!!
                            그거임☞    웜매?! s = new 웜매?!();
                                        s.영차();
                                        s.어기여차();
                                
                    결론 ::: 스크롤 미아가 안되도 돼!  위아래 다니며 int냐 String이냐 찾아다니지 않아도 됨!  

                        
                        
                        
                    
    
3.  " %d "의 자리에 어떻게 숫자가 알아서 오는가?

                    public static void plusTwo1() {
                    int a, b;
                    int sum = 0;   <ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 값이 0 에서부터 시작한다는 뜻임
                    Scanner sc = new Scanner(System.in);

                    System.out.println("두개의 숫자를 입력하시오.");
                    System.out.print("첫번째 : \n");
                    a = sc.nextInt();
                    System.out.print("두번째 : \n");
                    b = sc.nextInt();

                    sum = a + b;

                    String fmt = "입력한 수 : %d, %d  \n"   +   "총합 :  %d 입니다";  <---  a가 1번 %d 에 오고
                                              ↑   ↑                      ↑                 b가 2번 %d 에 오고
                                              a   b                     sum            ↙  sum 이 세번째라 총합: %d 에 오나봐!
                               System.out.printf(fmt, a, b, sum); }
            
           
                               
                               
                               
                                
4.        먹이를 찾아 산기슭을 어슬렁거리는 하이에나를 본 일이 있는가 / 하이애나한테 사과해라 -_-
                        
                        
                        
                        
                        
                        
                        
                        

}
