# Youtube Video Player (branch name : ***Second branch***)
#### This is an application thet playes videos from Youtube. We need to use the YouTube API that Google provide to make this happen and we also have to create an API key using our gmail account. 

## Steps to set up YouTube API
#### 1. Download or setup the following Items
|Activity|Link|
|--------|--------|
|YouTube API download|https://developers.google.com/youtube/android/player/downloads|
|API key creation|https://console.cloud.google.com/apis/credentials?project=youtube-video-player-321812&folder=&organizationId=|


#### 2. After Doing this clone the repository and check out the **"Second Branch"** (This can be done inside Android Studio by using the git option at the bottom right of the screen)

#### 3. Locate the ```YouTubeAndroidPlayerApi.jar*"``` file and copy it
#### 4. Paste the youtube api jat file in the ```libs``` section of the android studio project folder.(The only step that remains is getting the api key and using it in the code)

#### 5. The next step will beusing the API key generated by Google Cloud Platforms. Paste your API key replacing the pre-existing value in _mainActivity.kt_.

```kotlin
class MainActivity : YouTubeBaseActivity() {
    val VIDEO_ID = "TbJvVg7_shY"
    val YOUTUBE_API_KEY = "AIzaSyC3_hVuOhAxz2WFLQ3UMHidn-6El40lGzo" //-------Replcae this value with a new API key
    lateinit var youtubePlayer: YouTubePlayerView
    lateinit var btnPlay: Button
```
#### 6. Select a particluar youtube video which you want to play. We will be using the ```VIDEO_ID_``` instead of a Youtube link.
