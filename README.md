# react-native-android-advertising-id

## Getting started

`$ npm install react-native-android-advertising-id --save`

### Mostly automatic installation

`$ react-native link react-native-android-advertising-id`

## Usage
```javascript
import RNAdvertisingId from 'react-native-android-advertising-id';

// TODO: What to do with the module?
RNAdvertisingId.getAdvertisingId()
    .then(response => {
      this.setState({
        advertisingId: response.advertisingId,
        isLimitAdTrackingEnabled: response.isLimitAdTrackingEnabled,
      });
    })
    .catch(error => console.error(error));
```
