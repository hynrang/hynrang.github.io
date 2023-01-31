---
title:  "<유니티> 목표 프레임률 변경"

categories:
  - 유니티
tags:
  - [유니티]

toc: true
toc_sticky: true
 
date: 2023-01-31
last_modified_at: 2023-01-31
---

<br/>

```cs
using UnityEngine;

public class Example
{
    void Start()
    {
        // Make the game run as fast as possible
        Application.targetFrameRate = 300;
    }
}
```

<br/>

안드로이드 어플을 빌드해서 실행시켜보면 30fps로 작동하는데, 다른 프레임률을 사용하고 싶은 경우 유용하다.

---
<h3><b>참고</b></h3>

[Unity Documentation - Application.targetFrameRate](https://docs.unity3d.com/ScriptReference/Application-targetFrameRate.html)