package khProject;

public class Exercise {

   ExFrame ef = new ExFrame();
  
         //운동 선택 하는 변수 a , 레벨에 따른 중량 설정하는 변수 b
   public void back(int a, String weight) { 
      switch(a) {
      case 1:
         ef.title("랫풀다운");
         ef.sub1(" 스트레이트 바를 수직으로 다루어 광배근의");
         ef.sub2("최대이완과 수축을 반복합니다.");
         ef.weight(weight);
         break;

      case 2:
         ef.title("어시스트 풀업 & 풀업");
         ef.sub1(" 허리가 밀리지 않게 유의하여 견갑이");
         ef.sub2("자연스럽게 사용될 수 있도록 합니다.");
         ef.weight(weight);
         break;

      case 3:
         ef.title("원암 하이로우");
         ef.sub1(" 자연스러운 팔의 움직임을 기본으로");
         ef.sub2("급하지 않게 진행합니다.");
         ef.weight(weight);
         break;

      case 4:
         ef.title("시티드 로우");
         ef.sub1("상체가 딸려가지 않게");
         ef.sub2("긴장을 유지합니다");
         ef.weight(weight);
         break;

      case 5:
         ef.title("랙풀");
         ef.sub1(" 중량감이 승모근을 비롯해 광배근까지");
         ef.sub2("갈 수 있도록 수축시켜 줍니다.");
         ef.weight(weight);
         break;

      case 6:
         ef.title("바벨로우");
         ef.sub1(" 바벨이 몸에서 멀어지지 않도록 유의합니다.");
         //ef.sub2("갈 수 있도록 수축시켜 줍니다.");
         ef.weight(weight);
         break;
      }
   }

   public void arm(int a, String weight,boolean success) {
      switch(a) {
      case 1:
         ef.title("이두 - 바벨컬");
         ef.sub1(" 상,하체가 바벨 무게로 인해");
         ef.sub2("앞 뒤로 기울지 않게 진행합니다.");
         ef.weight(weight);
         break;

      case 2:
         ef.title("이두 - 프리쳐컬");
         ef.sub1(" 팔꿈치가 지나치게 모아지지 않게");
         ef.sub2("운동 동작이 편안한 자세에서 진행합니다.");
         ef.weight(weight);
         break;

      case 3:
         ef.title("이두 - 케이블컬");
         ef.sub1(" 케이블로 인한 중량감을 의식하여");
         ef.sub2("진행합니다.");
         ef.weight(weight);
         break;

      case 4:
         ef.title("케이블푸쉬다운");
         ef.sub1(" 손목이 불편하지 않게 로프를 잡아");
         ef.sub2("진행합니다.");
         ef.weight(weight);
         break;

      case 5:
         ef.title("클로즈그립벤치프레스");
         ef.sub1(" 손이 지나치게 모이면 손목부상으로");
         ef.sub2("이어지니 적당한 넓이를 유지합니다.");
         ef.weight(weight);
         break;

      case 6:
         ef.title("라잉트라이셉스익스텐션");
         ef.sub1(" 이마 부상에 유의합니다.");
         //ef.sub2("갈 수 있도록 수축시켜 줍니다.");
         ef.weight(weight);
         break;

      }

   }

   public void chest(int a, String weight,boolean success) {
      switch(a) {
      case 1:
         ef.title("벤치프레스");
         ef.sub1(" 좌우 균형이 흐트러지지 않게");
         ef.sub2("양 팔을 대칭시켜 들어올립니다.");
         ef.weight(weight);
         break;

      case 2:
         ef.title("인클라인 벤치프레스");
         ef.sub1(" 본인의 어깨가 편한 각도로");
         ef.sub2("벤치 각도를 조정합니다.");
         ef.weight(weight);
         break;

      case 3:
         ef.title("체스트프레스 머신");
         ef.sub1(" 가슴 고립을 유지하여 중량감을 느끼며");
         ef.sub2("밀어냅니다.");
         ef.weight(weight);
         break;

      case 4:
         ef.title("인클라인 체스트프레스 머신");
         ef.sub1(" 본인의 어깨가 편한 각도로");
         ef.sub2("벤치 각도를 조정합니다.");
         ef.weight(weight);
         break;

      case 5:
         ef.title("딥스");
         ef.sub1(" 지나치게 하강하여 어깨가");
         ef.sub2("부상입지 않도록 유의합니다.");
         ef.weight(weight);
         break;

      case 6:
         ef.title("플라이");
         ef.sub1(" 가슴 전만을 유지한 상태로");
         ef.sub2("팔을 가운데로 모아 줍니다.");
         ef.weight(weight);
         break;

      }
   }

   public void leg(int a, String weight,boolean success) {
      switch(a) {
      case 1:
         ef.title("스티프 데드리프트");
         ef.sub1(" 햄스트링이 늘어남을 느끼면서");
         ef.sub2("진행합니다.");
         ef.weight(weight);
         break;

      case 2:
         ef.title("레그프레스");
         ef.sub1(" 무릎이 지나치게 벌어지거나 모아지지 않도록");
         ef.sub2("발과 같은 방향으로 수축합니다.");
         ef.weight(weight);
         break;

      case 3:
         ef.title("레그익스텐션");
         ef.sub1(" 발을 세운 뒤 머신이 다리에서 이탈하지");
         ef.sub2("않도록 속도를 조절합니다.");
         ef.weight(weight);
         break;

      case 4:
         ef.title("레그컬");
         ef.sub1(" 발을 세운 뒤 최대 수축할 수 있는");
         ef.sub2("부분까지 도달합니다.");
         ef.weight(weight);
         break;

      case 5:
         ef.title("스미스머신 런지");
         ef.sub1(" 한쪽 다리에 지나치게 기울지않게끔");
         ef.sub2("유의합니다.");
         ef.weight(weight);
         break;

      case 6:
         ef.title("핵스쿼트");
         ef.sub1(" 허리에 부담이 가지 않게끔");
         ef.sub2("시선을 전방으로 유지합니다.");
         ef.weight(weight);
         break;

      }
   }
}
