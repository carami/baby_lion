### 실습 문제

#### 1. `Vehicle` 클래스와 상속을 이용한 확장

- **기본 요구사항**: `Vehicle`(탈 것) 기본 클래스를 생성하고, 이를 상속받는 `Car`(자동차)와 `Bicycle`(자전거) 클래스를 구현하세요.
  - `Vehicle` 클래스는 `speed`(속도)와 `color`(색상) 속성을 가져야 하며, `increaseSpeed(int increment)` 메서드와 `decreaseSpeed(int decrement)` 메서드를 포함해야 합니다.
  - `Car` 클래스는 `engineCapacity`(엔진 용량) 속성을 추가로 가지며, `increaseSpeed`와 `decreaseSpeed` 메서드의 작동을 조금 더 복잡하게 구현해보세요(예: 속도 증가량이 엔진 용량에 비례하도록).
  - `Bicycle` 클래스는 `gearCount`(기어 수) 속성을 추가로 가지며, 이 속성을 활용해 `increaseSpeed`와 `decreaseSpeed` 메서드를 다르게 구현해보세요.

#### 2. 다형성을 활용한 동물원 관리 시스템

- **기본 요구사항**: `Animal` 클래스를 상속받는 여러 동물 클래스(예: `Lion`, `Elephant`, `Eagle`)를 생성하고, 각 동물들이 `makeSound()` 메서드를 통해 고유의 소리를 낼 수 있도록 구현하세요.
  - 각 동물 클래스는 최소 하나 이상의 고유 속성을 가져야 합니다(예: `Lion`의 `maneSize`, `Elephant`의 `trunkLength`, `Eagle`의 `wingSpan`).
  - `Zoo` 클래스를 생성하여 여러 종류의 동물들을 관리할 수 있는 기능을 추가하세요. `Zoo` 클래스는 `Animal` 타입의 리스트를 속성으로 가지며, 동물을 추가(`addAnimal`)하거나, 모든 동물의 소리를 들을 수 있는(`makeAllSounds`) 메서드를 구현해야 합니다.

#### 3. `Person` 클래스 확장 실습

- **기본 요구사항**: `Person` 클래스에 `address`(주소) 속성을 추가하고, `this`를 활용하여 이 속성을 초기화하는 생성자를 추가로 구현해보세요.
  - 기존에는 이름과 나이만을 다루었다면, 이제는 주소 정보도 함께 다룰 수 있어야 합니다.
  - 주소 정보를 출력하는 `printAddress()` 메서드를 구현하고, 이전에 만든 `printInfo()` 메서드를 확장하여 이름, 나이, 주소 정보를 모두 출력할 수 있도록 수정해보세요.

이 실습 문제들을 통해 객체 지향 프로그래밍의 핵심 개념들을 더욱 심화하고, 실제 코드 작성을 통해 이론을 실제로 적용해보는 경험을 할 수 있습니다.

아기사자들 화이팅!!!
