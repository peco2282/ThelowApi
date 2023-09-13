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
public class Dungeon implements TheLowApi {

    private String name;

    private String difficulty;

    private int x;

    private int y;

    private int z;
}
