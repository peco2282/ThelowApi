package jp.xdomain.peco2282.thelowapi;

import jp.xdomain.peco2282.thelowapi.api.parse.ApiType;
import org.junit.Test;

public class TestCompile {
  String s = "{\"apiType\": \"dungeon\",\"version\": 1,\"response\": [" +
    "{\"x\": -1014, \"y\": 71,\"z\": 823,\"name\": \"訓練所\",\"difficulty\": \"With Full Force\"}," +
    "{\"x\": -950, \"y\": 72, \"z\": -1359,\"name\": \"キャラウェイ \", \"difficulty\": \"24\"}," +
    "{\"x\": -1103, \"y\": 74, \"z\": 345, \"name\": \"エイドリアン城\", \"difficulty\": \"68\"}" +
    "]}";
  @Test
  public void parse() {
    System.out.println(new ApiParser(ApiType.DUNGEON, s).parseAsDungeon());
  }
  /*
  String pstatus = """
    {
      "apiType": "player_status",
      "version": 1,
      "response": {
        "uuid": "67d7d0a0-2e5a-498c-b74b-ea72e0b10b3d",
        "mcid": "Namiken",
        "mainLevel": 60,
        "swordStatus": {
          "leve": 60,
          "exp": 0,
          "maxLevel": 60,
          "reincCount": 60
        },
        "bowStatus": {
          "leve": 60,
          "exp": 0,
          "maxLevel": 60,
          "reincCount": 15
        },
        "magicStatus": {
          "leve": 60,
          "exp": 0,
          "maxLevel": 60,
          "reincCount": 8
        },
        "clanInfo": {
          "clanId": "cf4d122",
          "clanName": "クラン名",
          "clanRank": "UNRANKED"
        },
        "galions": 94645607,
        "unit": 99870060,
        "jobName": "ルーンキャスター"
      }
    }
    """;
  String dungeon = """
    {
        "apiType": "dungeon",
        "version": 1,
        "response": [
            {
                "x": -1014,
                "y": 71,
                "z": 823,
                "name": "訓練所",
                "difficulty": "With Full Force"
            },
            {
                "x": -950,
                "y": 72,
                "z": -1359,
                "name": "キャラウェイ ",
                "difficulty": "24"
            },
            {
                "x": -1103,
                "y": 74,
                "z": 345,
                "name": "エイドリアン城",
                "difficulty": "68"
            }
        ]
    }""";

  String loc = """
    {
        "apiType": "location",
        "version": 1,
        "response": {
            "worldName": "thelow",
            "x": -243.23572428517824,
            "y": 100,
            "z": -110.29727079660066
        }
    }""";

  String ct = """
    {
        "apiType": "skill_cooltime",
        "version": 1,
        "response": {
            "name": "冥府の審判",
            "cooltime": 65.0,
            "type": "SPECIAL_SKILL"
        }
    }""";

  @Test
  public void parse() {
    System.out.println(new ApiParser(ApiType.PLAYER, pstatus).parseAsPlayer());
    System.out.println(new ApiParser(ApiType.DUNGEON, dungeon).parseAsDungeon());
    System.out.println(new ApiParser(ApiType.LOCATION, loc).parseAsLocation());
    System.out.println(new ApiParser(ApiType.SKILL_COOLTIME, ct).parseAsSkillCooltime());
  }*/
}
