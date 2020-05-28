package com.example.facerecognition.classify

// Expected json payload for webservice.
// {
//   "payload": {
//     "image": {
//       "imageBytes": "YOUR_IMAGE_BYTE"
//     }
//   }
// }

data class CloudAutoMLModel(val payload: Payload)

data class Payload(val image: MlImage)

data class MlImage(val imageBytes: String)