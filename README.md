![Static Badge](https://img.shields.io/badge/version-1.0-blue)
![license](https://img.shields.io/github/license/peco2282/ThelowApi)

# Thelow-API wrapper library
TheLow-modding用のAPIラッパーライブラリ

## install
<br>

`build.gradle` (gradle-3.1)
```groovy

repositories {
  maven {
    name = "github"
    url = "https://maven.pkg.github.com/peco2282/thelowapi"
    credentials {
      username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
      password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
    }
  }
}

dependencies {
  compile("jp.xdomain.peco2282.thelowapi:thelowapi:1.0")
}
```

## 使用例

```java
import jp.xdomain.peco2282.thelowapi.ApiParser;

import java.util.Arrays;

public class TestMod {
  String dungeon = "{\"apiType\": \"dungeon\",\"version\": 1,\"response\": [" +
    "{\"x\": -1014, \"y\": 71,\"z\": 823,\"name\": \"訓練所\",\"difficulty\": \"With Full Force\"}," +
    "{\"x\": -950, \"y\": 72, \"z\": -1359,\"name\": \"キャラウェイ \", \"difficulty\": \"24\"}," +
    "{\"x\": -1103, \"y\": 74, \"z\": 345, \"name\": \"エイドリアン城\", \"difficulty\": \"68\"}" +
    "]}";

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new ApiParser(dungeon).parseAsDungeon().response()));
    // DungeonResponse(response=[Dungeon(name=訓練所, difficulty=With Full Force, x=-1014, y=71, z=823), Dungeon(name=キャラウェイ , difficulty=24, x=-950, y=72, z=-1359), Dungeon(name=エイドリアン城, difficulty=68, x=-1103, y=74, z=345)])
  }
}
```
