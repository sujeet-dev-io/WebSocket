# WebSocket
# WebSocket Testing

This repository is for testing WebSocket connections using [WebSocket King](https://websocketking.com/) and Postman.

## WebSocket Endpoint

```
ws://localhost:8080/ws/topic
```

## Testing with WebSocket King

1. Open [WebSocket King](https://websocketking.com/).
2. Enter the WebSocket URL:
   ```
   ws://localhost:8080/ws/topic
   ```
3. Click **Connect**.
4. Send a test message in the message input box and click **Send**.
5. Check for responses from the server.

![WebSocket Test Website](https://github.com/user-attachments/assets/c9cea3e8-9731-4378-82e4-858decf58ca9)

## Testing with Postman

1. Open **Postman**.
2. Click on **New Request** > Select **WebSocket Request**.
3. Enter the WebSocket URL:
   ```
   ws://localhost:8080/ws/topic
   ```
4. Click **Connect**.
5. Once connected, enter a message in the **Message** tab and click **Send**.
6. Observe the responses received from the server.
![Testing PostMan](https://github.com/user-attachments/assets/fa90d7cb-506c-4e88-806c-5ddc16d360c1)

## Prerequisites
- Ensure your WebSocket server is running on `localhost:8080`.
- Verify that there are no firewall or network restrictions preventing WebSocket connections.

## Troubleshooting
- If the connection fails, check if the WebSocket server is running.
- Ensure the correct WebSocket URL is used.
- Look for errors in the server logs for more details.

