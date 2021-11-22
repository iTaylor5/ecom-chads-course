export default {
    // client id is the public identifier of client app
    // issuer of tokens - okta domain
    // 
    oidc: {
        clientId: '0oa2k6nxsgaieBet95d7',

        issuer: 'https://dev-10878602.okta.com/oauth2/default',
        redirectUri: 'https://localhost:4200/login/callback',
        scopes: ['openid', 'profile', 'email']
    }
}
