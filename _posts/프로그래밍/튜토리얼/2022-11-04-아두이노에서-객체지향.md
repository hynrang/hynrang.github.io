---
title: "아두이노에서 객체지향 활용하기"

categories: [프로그래밍, 튜토리얼]
tags: [아두이노, 객체지향, 프로그래밍]

toc: true
toc_sticky: true
 
date: 2022-11-04
last_modified_at: 2023-04-12
---

# **들어가며**

개인적으로 아두이노를 별로 좋아하는 편은 아닙니다. 하드웨어단에서 발생하는 오류를 잡기 어렵기 때문인데, 이번에 아두이노로 물건을 만들어야 하는 상황에 놓이게 되었습니다.

"이왕 하는거 새로운 것에 도전해서 뭐라도 배워가자" 하는 마음에 빈약한 지식으로 객체지향 설계를 시도했습니다. 아두이노는 C++을 기반으로 동작하는데, C#이나 파이썬과는 특성이 달라 조금 생소했네요. 어려움은 있었지만 잘 동작하는 모습까지 확인하고 나니 뿌듯합니다. 혹시라도 나중에 C++을 다루게 된다면 도움이 되면 좋겠습니다.

<br>

```cpp
// Arduino_OOP.ino

void setup()
{
    ...
}

void loop()
{
    Money = MainFunctions.AddFiveHundreadWon(Money);
    Money = MainFunctions.AddOneHundreadWon(Money);
    Money = MainFunctions.AddFiftyWon(Money);
}
```

```cpp
// MainFunctions.cpp

#include "Arduino.h"

class MainFunctions
{
  public:
    AddFiveHundreadWon(int Money);
    AddOneHundreadWon(int Money);
    AddFiftyWon(int Money);
};
```

```cpp
// MainFunctions.h

#include "Arduino.h"
#include "MainFunctions.h"

int MainFunctions::AddFiftyWon(int Money)
{
  Money += 500;
  return Money;
}

int MainFunctions::AddOneHundreadWon(int Money)
{
  Money += 1000;
  return Money;
}

int MainFunctions::AddFiveHundreadWon(int Money)
{
  Money += 2000;
  return Money;
}
```