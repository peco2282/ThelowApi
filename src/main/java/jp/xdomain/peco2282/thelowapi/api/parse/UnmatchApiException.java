package jp.xdomain.peco2282.thelowapi.api.parse;

import jp.xdomain.peco2282.thelowapi.ApiParser;

/**
 * @author peco2282
 * @see ApiParser
 */
public class UnmatchApiException extends RuntimeException {
  public UnmatchApiException(ApiType current, ApiType correct) {
    super(String.format("%s was supposed to be selected, but %s was selected", correct, current));
  }
}
