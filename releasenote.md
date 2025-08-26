# Code Quality

## Before
<img width="1226" height="210" alt="apibefore" src="https://github.com/user-attachments/assets/d3546643-3927-4e5a-aa76-7512e5f2a0bb" />

### Relibelity C
It's an autowired issue

### In controller

changed from
```
    @AutoWired
    private SsoService ssoService
```
changed to
```
    private final SsoService ssoService;
    public controller(SsoService ssoService) {
      this.ssoService = ssoService;
    }
```
### In SsoService

changed from
```
    @AutoWired
    private SsoRepository ssoRepository
```
changed to
```
    private final SsoRepository ssoRepository;
    public SsoService(SsoRepository ssoRepository) {
        this.ssoRepository = ssoRepository;
    }
```
## Result
<img width="1190" height="643" alt="apiafter" src="https://github.com/user-attachments/assets/4631e9a5-8993-452e-b802-ef51e50ca9a3" />
