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
public abstract class AbstractApiResponse<T extends TheLowApi> implements TheLowApi {
    private String apiType;
    private int version;
}
