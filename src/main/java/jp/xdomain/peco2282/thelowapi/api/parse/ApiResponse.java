package jp.xdomain.peco2282.thelowapi.api.parse;

import jp.xdomain.peco2282.thelowapi.api.TheLowApi;
import lombok.Getter;
import lombok.ToString;

/**
 * @author peco2282
 */
@Getter
@ToString
public class ApiResponse<T extends TheLowApi> extends AbstractApiResponse<T>{
  private T response;
}
