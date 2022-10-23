#### 프로젝트 소개

<img width="200" alt="KakaoTalk_20221024_001715148" src="https://user-images.githubusercontent.com/13767077/197402190-abde83bc-1096-4b9d-b403-41e0776ccdcc.png"><br/>
- 테트리스 게임입니다
- 자바의 swing,awt라이브러리를 이용해서 구현한 GUI게임입니다.

#### 개발환경 및 기술
- 언어 : java11
- 운영체제 : window

#### 프로젝트 목적
- 테스트코드 작성을 연습하기 위해 시작했습니다.
- 테스트코드를 작성하면서 기존에 개발했던 소스를 지속적으로 리팩토링했습니다.

#### 프로젝트구조
<img width="400" alt="KakaoTalk_20221024_003601322" src="https://user-images.githubusercontent.com/13767077/197402284-c7acb02d-5314-4c1a-8ad2-d6c956cf6325.png">

#### 어려웠던점 및 개선점
- 이전까지 스프링 기반의 웹 개발만 해왔기 떄문에 클래스를 나누고 역할과 책임을 분배하는게 힘들었습니다.
  - 회사에서는 이미 구조화된 패키지와 클래스(@Service,@Controller..)내에서 비즈니스 로직을 작성하는 일이 많았습니다.

- 개선을 위해 우아한테크캠프에서 배웠던 방법을 프로젝트에 적용해보았습니다.
  - 메소드의 들여쓰기는 두번미만으로 진행
  - 메소드의 코드는 10줄 넘어가지 않기
  - 숫자 하드코딩 하지 않기
  - 일급컬렉션사용, 원시값과 문자열 포장
  - mvc기반의 프로젝트에선 model중심의 테스트코드 작성 
