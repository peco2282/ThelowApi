package jp.xdomain.peco2282.thelowapi.api.parse;

import jp.xdomain.peco2282.thelowapi.api.TheLowApi;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * @author peco2282
 */
@Getter
@ToString
@SuppressWarnings("unused")
public class Player implements TheLowApi {

  private UUID uuid;

  private String mcid;

  private int mainLevel;
  private Status swordStatus;

  private Status bowStatus;

  private Status magicStatus;

  private ClanInfo clanInfo;

  private long galions;

  private long unit;

  private String jobName;

  private static class Status {

    private int leve;

    private int exp;

    private int maxLevel;

    private int reincCount;

  }

  private static class ClanInfo {

    private String clanId;

    private String clanName;

    private String clanRank;

  }
}
