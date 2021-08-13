# Table of Contents
 - [Youtube video player](#x)
      - [Steps for setup](#a)
      - [Play, Pause and skip](#b)
 - [Video Parser](#y)
      - [Steps](#c)
 - [URL-ID search bar included youtube video player](#z)
      - [code](#d)
      - [App Snippet](#e)
      - [How to lanch the app](#f)




<div name = 'x'/>

# ✅ Youtube Video Player (branch name : ```Second branch```). ```FoxFire TV Team Assignment``` 
#### This is an application thet playes videos from Youtube. We need to use the YouTube API that Google provide to make this happen and we also have to create an API key using our gmail account. 

<div name = 'a'/>

## Steps to set up YouTube API 
#### 1. Download or setup the following Items
|Activity|Link|
|--------|--------|
|YouTube API download|https://developers.google.com/youtube/android/player/downloads|
|API key creation|https://console.cloud.google.com/apis/credentials?project=youtube-video-player-321812&folder=&organizationId=|


#### 2. After Doing this clone the repository and check out the **"Second Branch"** (This can be done inside Android Studio by using the git option at the bottom right of the screen)

#### 3. Locate the ```YouTubeAndroidPlayerApi.jar*"``` file from the downloaded API and copy it
#### 4. Paste the youtube api jat file in the ```libs``` section of the android studio project folder.(The only step that remains is getting the api key and using it in the code)

#### 5. The next step will beusing the API key generated by Google Cloud Platforms. Paste your API key replacing the pre-existing value in _mainActivity.kt_.

```kotlin
class MainActivity : YouTubeBaseActivity() {
    val VIDEO_ID = "TbJvVg7_shY"
    val YOUTUBE_API_KEY = "API-KEY" //-------Replace "API-KEY" with a new API key
    lateinit var youtubePlayer: YouTubePlayerView
    lateinit var btnPlay: Button
```
#### 6. Select a particluar youtube video which you want to play. We will be using the ```VIDEO_ID_``` instead of a Youtube link.
#### A ```VIDEO_ID```  is a part of a youtube link that comes after the equal sign(=). That is the part of the link that always comes after ```https://www.youtube.com/watch?v=```. We only need this ```VIDEO_ID``` fragment of the link and we will fetch the youtube video and play it on our emulator using our app.

<div name = 'b'/>

## How do we play, pause and scroll view of this YouTube video?


##### We will use the built in widget call ```MediaPlayer``` that will provide us with this functionality of play,pausing and scrolling view of our video






<div name= "y"/>

# ✅ Video Pareser (branch name: ```third branch```) 

### This is another application that can be used to parse a video in mp4 and other video formats. 

<div name = 'c'/>

## Steps to run the video of your choice

1. Checkout to branch ```third branch ```
2.  Copy and paste your video in the ```res``` file of the android studio project 
3. change or update the location of the video file in the line of code below. 
```kotlin
videoView!!.setMediaController(mediaController)

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.video)) //----check or update file location

        videoView!!.requestFocus()
```
4. Run the app 


<div name= "z"/>

# ✅ URL-ID search bar included app (```URL-ID``` branch) 

#### The previous application (the one on ```second branch```) had a URL-ID that was hard coded. This application includes a text widget that will take any URL-ID (hence play any video) when the video URL-ID is placed.

<div name = 'd'/>

### Add the snippet of code below to add a text widget

```xml
 <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/TextInputLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="120dp"
        android:layout_marginEnd="80dp"
        android:layout_marginBottom="181dp"
        android:orientation="vertical"
        android:hint = "URL"
        app:layout_constraintBottom_toTopOf="@+id/youtubePlayer"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0">
    

        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/TextInputEdit"
            android:layout_width="298dp"
            android:layout_height="match_parent" />
    </com.google.android.material.textfield.TextInputLayout>
```

### Add the following code of snippet to add a button for the text widget so thath user can confirm the URL-ID
```xml
<Button
        android:id="@+id/button1"
        android:layout_width="123dp"
        android:layout_height="41dp"
        android:layout_marginStart="127dp"
        android:layout_marginTop="25dp"
        android:layout_marginEnd="161dp"
        android:layout_marginBottom="114dp"
        android:text="OK"
        app:layout_constraintBottom_toTopOf="@+id/youtubePlayer"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.043"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/TextInputLayout"
        app:layout_constraintVertical_bias="0.137" />
```
<div name = 'e'/>

### Snippet of what the application looks like
<img src = https://github.com/Nlege001/Youtube_Video_Player/blob/master/youtubeapp.jpg width = 300>

<div name = 'e'/>

### How to use the app
1. Copy the youtube video's URL-ID
2. paste it in to the application
3. press ```ok``` to confirm
4. press ```Play``` to play
