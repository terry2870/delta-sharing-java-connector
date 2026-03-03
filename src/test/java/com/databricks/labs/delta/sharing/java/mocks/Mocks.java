package com.databricks.labs.delta.sharing.java.mocks;

/** 
 * Mock for provider json.
 */
public class Mocks {
  public static String providerJson = "{\n" + "  \"shareCredentialsVersion\": 1,\n"
      + "  \"endpoint\": \"https://eastus2-c2.azuredatabricks.net/api/2.0/delta-sharing/metastores/0a9816dc-5c58-48a6-b35d-b9247f3b8b72\",\n"
      + "  \"bearerToken\": \"nft4d8RYbezel-pKx3iaFqAuS_AZbpMei-5HQg6B_N6pQWpo3zd-aINA-5Gr6Bdr\"\n" + "}";

  public static String ProviderJsonUnsupportedCredentials =
      "{\n" + "  \"shareCredentialsVersion\": 12,\n"
          + "  \"endpoint\": \"https://sharing.delta.io/delta-sharing/\",\n"
          + "  \"bearerToken\": \"faaie590d541265bcab1f2de9813274bf233\"\n" + "}";

  public static String ProviderJsonNoEndpoint = "{\n" + "  \"shareCredentialsVersion\": 12,\n"
      + "  \"bearerToken\": \"faaie590d541265bcab1f2de9813274bf233\"\n" + "}";

  public static String ProviderJsonNoToken = "{\n" + "  \"shareCredentialsVersion\": 1,\n"
      + "  \"endpoint\": \"https://sharing.delta.io/delta-sharing/\",\n" + "}";
}
