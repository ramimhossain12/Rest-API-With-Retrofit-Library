# Retrofit-Library

In this tutorial we are having the Retrofit Android Library Tutorial which is a type-safe HTTP client for Android and Java by Square. By using Retrofit in Android we can seamlessly capture JSON responses from a web API. It is different from other libraries because Retrofit gives us an easy way to use since it uses the GSON library in background to parse the responses. All we need to do is define a POJO (Plain Old Java Object) to do all the parsing. In this Retrofit Android Library Tutorial, we will discuss the basic scenarios where it can be used.

 



#Converters:

In the past, Retrofit relied on the GSON library to serialize and deserialize JSON data. Retrofit 2 now supports many different parsers for processing network response data, including Moshi, a library build by Square for efficient JSON parsing. However, there are a few limitations, so if you are not sure which one to choose, use the Gson converter for now.

| CONVERTER  | LIBRARY |
| ------------- |:-------------:|
| Gson  | com.squareup.retrofit2:converter-gson:2.0.2 |
| Jackson  | com.squareup.retrofit2:converter-jackson:2.0.2 |
| Moshi | com.squareup.retrofit2:converter-moshi:2.0.2  |
| Protobuf  | com.squareup.retrofit2:converter-protobuf:2.0.2 |
| Wire  | com.squareup.retrofit2:converter-wire:2.0.2 |
| Simple XML | com.squareup.retrofit2:converter-simplexml:2.0.2 |

 

# Library Added:
* Retrofit All Library dependency and its Gson converter library dependency should be added in the build.gradle of Retrofit Example Application:

```xml
 implementation 'com.squareup.retrofit2:retrofit:2.4.0'
 implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
 implementation 'com.squareup.okhttp3:logging-interceptor:4.8.0'
```

* Internet permission should be added in the Manifest.xml file.
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```


# Features:

* Simple Get Request
* Retrofit URL Manipulation
@PATH,
@QUERY,
@QUERYMAP,
URL
* POST REQUEST & FORM URLENCODED
* PUT ,PATCH,DELETE REQUEST
* LOG HTTP REQUEST & RESPONSE WITH LOGGIN
* ADD HEADERS
 
