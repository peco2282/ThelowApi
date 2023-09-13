package jp.xdomain.peco2282.thelowapi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jp.xdomain.peco2282.thelowapi.api.TheLowApi;
import jp.xdomain.peco2282.thelowapi.api.parse.*;
import lombok.Getter;
import lombok.Setter;

/**
 * This class converts the given string into AbstractApiResponse format.
 *
 * @author peco2282
 * @see TheLowApi
 * @see AbstractApiResponse
 */
@Getter
@SuppressWarnings("unused")
public class ApiParser {
  ApiType apiType;
  @Setter
  String rawContent;
  String PREFIX = "$api";

  /**
   * Create an instance with the type you want to convert and the given string
   *
   * @param apiType Type you want to convert
   * @param c       String given to api.
   * @see ApiType
   */
  public ApiParser(ApiType apiType, String c) {
    this.apiType = apiType;
    this.rawContent = c;
  }

  /**
   * @return Convert given string to `Player` class as array.
   * @throws UnmatchApiException throw when apitype is not unmatch.
   * @see Player
   * @see ApiParser#parse()
   */
  public ApiResponse<Player> parseAsPlayer() {
    if (apiType != ApiType.PLAYER) throw new UnmatchApiException(apiType, ApiType.PLAYER);
    return parse();
  }

  /**
   * @return Convert given string to `Dungeon` class as array.
   * @throws UnmatchApiException throw when apitype is not unmatch.
   * @see Dungeon
   * @see ApiParser#parse()
   */
  public DungeonResponse parseAsDungeon() {
    if (apiType != ApiType.DUNGEON) throw new UnmatchApiException(apiType, ApiType.DUNGEON);
    return parse();
  }

  /**
   * @return Convert given string to `Location` class as array.
   * @throws UnmatchApiException throw when apitype is not unmatch.
   * @see Location
   * @see ApiParser#parse()
   */
  public ApiResponse<Location> parseAsLocation() {
    if (apiType != ApiType.LOCATION) throw new UnmatchApiException(apiType, ApiType.LOCATION);
    return parse();
  }

  /**
   * @return Convert given string to `SkillCooltime` class as array.
   * @throws UnmatchApiException throw when apitype is not unmatch.
   * @see SkillCooltime
   * @see ApiParser#parse()
   */
  public ApiResponse<SkillCooltime> parseAsSkillCooltime() {
    if (apiType != ApiType.SKILL_COOLTIME) throw new UnmatchApiException(apiType, ApiType.SKILL_COOLTIME);
    return parse();
  }


  /**
   * @return Returns a class that implements TheLowApi interface.
   * <br>
   * If you want to use it, you need to cast it yourself.
   * @see ApiParser#parseAsPlayer()
   * @see ApiParser#parseAsDungeon()
   * @see ApiParser#parseAsLocation()
   * @see ApiParser#parseAsSkillCooltime()
   */
  @SuppressWarnings({"DuplicateBranchesInSwitch", "unchecked"})
  public <T extends TheLowApi, R extends AbstractApiResponse<T>> R parse() {
    Gson gson = new Gson();
    String content = this.rawContent.replace(PREFIX, "");
    AbstractApiResponse<T> abstractApiResponse = new AbstractApiResponse<T>() {};
    switch (apiType) {
      case PLAYER:
        abstractApiResponse = gson.fromJson(content, new TypeToken<ApiResponse<Player>>() {
        }.getType());
        break;
      case DUNGEON:
        abstractApiResponse = gson.fromJson(content, new TypeToken<DungeonResponse>() {
        }.getType());
        break;
      case LOCATION:
        abstractApiResponse = gson.fromJson(content, new TypeToken<ApiResponse<Location>>() {
        }.getType());
        break;
      case SKILL_COOLTIME:
        abstractApiResponse = gson.fromJson(content, new TypeToken<ApiResponse<SkillCooltime>>() {
        }.getType());
        break;
    };
    return (R) abstractApiResponse;
  }
}
