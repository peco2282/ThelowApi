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
public class SkillCooltime implements TheLowApi {

  private String name;

  private float cooltime;

  private String type;

  public SkillType getSkillType() {
    SkillType skillType;
    switch (type) {
      case "SPECIAL_SKILL":
        skillType = SkillType.SPECIAL_SKILL;
        break;

      case "NORMAL_SKILL":
        skillType = SkillType.NORMAL_SKILL;
        break;

      default:
        skillType = SkillType.UNKNOWN;
        break;
    };
    return skillType;
  }

  public enum SkillType {
    SPECIAL_SKILL,
    NORMAL_SKILL,
    UNKNOWN;
  }
}
