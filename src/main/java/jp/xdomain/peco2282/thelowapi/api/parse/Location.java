package jp.xdomain.peco2282.thelowapi.api.parse;

import jp.xdomain.peco2282.thelowapi.api.TheLowApi;
import lombok.Getter;
import lombok.ToString;

/**
 * @author peco2282
 */
@Getter
@ToString
@SuppressWarnings("unused")
public class Location implements TheLowApi {
  private String worldName;

  private double x;

  private double y;

  private double z;

  public WorldType getLocationType() {
    WorldType worldType;
    switch (worldName) {
      case "thelow":
        worldType = WorldType.THELOW;
      case "dungeon":
        worldType = WorldType.DUNGEON;
      case "house":
        worldType = WorldType.HOUSE;
      case "tutorial":
        worldType = WorldType.TUTORIAL;
      default:
        worldType = WorldType.UNKNOWN;
    };
    return worldType;
  }

  public enum WorldType {
    THELOW,
    DUNGEON,
    HOUSE,
    TUTORIAL,
    UNKNOWN;
  }
}
