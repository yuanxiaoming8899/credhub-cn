package org.cloudfoundry.credhub.helper;

import org.cloudfoundry.credhub.data.EncryptionKeyCanaryDataService;
import org.cloudfoundry.credhub.entity.EncryptionKeyCanary;
import org.cloudfoundry.credhub.util.StringUtil;

final public class EncryptionCanaryHelper {

  private EncryptionCanaryHelper() {
  }

  public static EncryptionKeyCanary addCanary(
    EncryptionKeyCanaryDataService encryptionKeyCanaryDataService) {
    EncryptionKeyCanary testCanary = new EncryptionKeyCanary();
    testCanary.setEncryptedCanaryValue("expectedCanaryValue".getBytes(StringUtil.UTF_8));
    testCanary.setNonce("nonce".getBytes(StringUtil.UTF_8));

    encryptionKeyCanaryDataService.save(testCanary);

    return testCanary;
  }
}
