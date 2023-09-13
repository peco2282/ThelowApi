package jp.xdomain.peco2282.thelowapi.api.parse;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DungeonResponse extends AbstractApiResponse<Dungeon> {
  private Dungeon[] response;
}
